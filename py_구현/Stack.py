# Python3 스택 구현
class MyStack:
    def __init__(self):
        self.stack = []
        self.size = -1
    
    def push(self, value):
        self.stack.append(value)
        self.size += 1
    
    def pop(self):
        if self.size >= 0:
            var = self.top()
            del self.stack[len(self.stack)-1]
            self.size -= 1
            return var

def top(self):
    return self.stack[len(self.stack)-1]
    
    def empty(self):
        if self.size == -1:
            return True
        else:
            return False

def size_(self):
    return self.size+1
    
    def print(self):
        print(self.stack)


var = MyStack()
var.print()
var.push(1)
var.push(3)
var.push(5)
var.print()
var.pop()
var.print()
print('size: ' + str(var.size_()))
print('isEmpty: ' + str(var.empty()))
