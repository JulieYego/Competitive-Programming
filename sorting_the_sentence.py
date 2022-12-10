s = "is2 sentence4 This1 a3"
sorted_sentence = s.split()
sorted_sentence = sorted(sorted_sentence, key=lambda x: int(x[-1]))
sorted_sentence = [x[:-1] for x in sorted_sentence]

print(" ".join(sorted_sentence))
"""list1 = sorted(list1, key=lambda x: int(x[-1]))
list1 = [x[:-1] for x in list1]
print(" ".join(list1))"""

# g = lambda x: 3 * x + 1 #x - inputs
# print(g(2))

# full_name = lambda fn,ln: fn.strip().title()+ " "

# lambda inputs: purpose
