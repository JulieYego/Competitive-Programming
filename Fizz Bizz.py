class Solution(object):
    def fizzBuzz(self, n):
        self.n = n
        self.r = range(1, (n + 1))
        self.mylist = []
        for i in self.r:
            if (i % 3 == 0) and (i % 5 == 0):
                self.mylist.append("FizzBuzz")

            elif i % 3 == 0:
                self.mylist.append("Fizz")

            elif i % 5 == 0:
                self.mylist.append("Buzz")

            else:
                self.mylist.append(str(i))
        print(self.mylist)


num = Solution()
num.fizzBuzz(15)
