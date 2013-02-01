
class Test
	def initialize()

	end

	def triangle(n)
		if 1 + 8*n < 0 then
			return false
		else
			i1 = 0.5 * (-1 + Math.sqrt(1 + 8*n))
			i2 = 0.5 * (-1 - Math.sqrt(1 + 8*n))
			cut_i1 = i1.to_i
			cut_i2 = i2.to_i
			if (cut_i1 == i1) & (i1 > 0)
				return true
			elsif (cut_i2 == i1) & (i2 > 0)
				return true
			else
				return false
			end
		end
	end

	def pentagonal(n)
		delta = 1 + 24*n
		if delta < 0 then
			return false
		else
			r1 = (1.0/6) * (1 + Math.sqrt(delta))
			r2 = (1.0/6) * (1 - Math.sqrt(delta))
			cut_r1 = r1.to_i
			cut_r2 = r2.to_i
			if (cut_r1 == r1) & (r1 > 0)
				return true
			elsif (cut_r2 == r1) & (r2 > 0)
				return true
			else
				return false
			end
		end
	end	

	def hexagonal(n)
		delta = 1 + 8*n
		if delta < 0 then
			return false
		else
			r1 = 0.25 * (1 + Math.sqrt(delta))
			r2 = 0.25 * (1 - Math.sqrt(delta))
			cut_r1 = r1.to_i
			cut_r2 = r2.to_i
			if (cut_r1 == r1) & (r1 > 0)
				return true
			elsif (cut_r2 == r1) & (r2 > 0)
				return true
			else
				return false
			end
		end
	end
end
i = 278000000
o = Test.new
while(true)
	if o.triangle(i) & o.pentagonal(i) & o.hexagonal(i) then 
		print i," ",o.triangle(i)," ",o.pentagonal(i)," ",o.hexagonal(i)
		puts " "
		break
	else
		print i," ",o.triangle(i)," ",o.pentagonal(i)," ",o.hexagonal(i), "\n"
		i += 1
	end
end

