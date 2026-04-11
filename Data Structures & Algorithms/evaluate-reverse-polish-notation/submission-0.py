class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        ops = ["+", "-", "*", "/"]
        number_stack = []

        for token in tokens:
            if token in ops:
                second_int = int(number_stack.pop())
                first_int = int(number_stack.pop())

                if token == "+":
                    total = first_int + second_int
                elif token == "-":
                    total = first_int - second_int
                elif token == "*":
                    total = first_int * second_int
                else:
                    total = int(first_int / second_int)

                number_stack.append(total)
            else:
                number_stack.append(token)

        return int(number_stack.pop())

            
