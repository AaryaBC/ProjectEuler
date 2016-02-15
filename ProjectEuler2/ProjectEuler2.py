def ProjectEuler2():
	s = 2
	first = 1
	second = 2
	nex = first + second
	while nex < 4000000:
		if nex % 2 == 0:
			s += nex
		first = second
		second = nex
		nex = first + second
	return s

print(ProjectEuler2())