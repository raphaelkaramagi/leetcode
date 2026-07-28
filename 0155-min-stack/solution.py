class MinStack:

    def __init__(self):
        self.items = []
        self.min = math.inf
        self.prevMins = []

    def push(self, value: int) -> None:
        if value <= self.min:
            self.prevMins.append(self.min)
        self.min = min(value, self.min)
        return self.items.append(value)

    def top(self) -> int:
        return self.items[-1]

    def pop(self) -> None:
        if self.top() == self.min:
            self.min = self.prevMins.pop()
        return self.items.pop()


    def getMin(self) -> int:
        return self.min


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(value)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
