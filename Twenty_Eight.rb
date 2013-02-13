def self.sumOf(arr)
	sum = 0
	for it in arr
		sum += it
	end
	return sum
end

a = Array.new(0)
b = Array.new(0)
c = Array.new(0)
d = Array.new(0)

for i in (1..501)
	a << 4*i**2 - 6*i + 3
	b << 4*i**2 - 4*i +1
	c << 4*i**2 - 10*i + 7 
	d << 4*i**2 - 8*i + 5
end

puts sumOf(a)+sumOf(b)+sumOf(c)+sumOf(d)-3