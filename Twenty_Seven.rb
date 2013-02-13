class Pairs
	@a
	@b

	def init(a,b)
		@a = a
		@b = b
	end

	def toString
		print "[",@a," ,",@b,"]","\n"
	end
end

def self.search(a,b)
	n = 0
	count = 0
	while(true)
		curr = n**2 + n*a + b
		if(isPrime(curr)) then
			count += 1
		else
			break
		end
		n += 1
	end
	return count
end

def self.isPrime(n)
	if n == 1 then
		return false
	end
	i = 2
	if (n < 0) then
		n = -1*n
	end
	while(i <= Math.sqrt(n))
		if(n % i == 0) then
			return false
		end
		i += 1
	end
	return true
end


max = 0
for a in (-999...1000)
	for b in (-999...1000)
		print "searching:","  ",a,"  ",b,"  ",max ,"\n"
		primeCount = search(a,b)
		if max < primeCount then
			pair = Pairs.new
			pair.init(a,b)
			max = primeCount
		end
	end 
end
pair.toString
