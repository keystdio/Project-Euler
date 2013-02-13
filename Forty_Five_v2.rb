def self.search(target,arr)
	if arr.length == 1 then 
		return target == arr[0]
	else
		halfWay = arr.length/2
		if arr[halfWay] == target then
			return true;
		elsif arr[halfWay] < target then
			search(target,arr[halfWay..arr.length])
		else 
			search(target,arr[0..halfWay-1])
		end
	end
end



first = Array.new(0)
second = Array.new(0)
third = Array.new(0)
for n in (2..1000000)
	first << n*(n+1)/2
	second << n*(3*n-1)/2
	third << n*(2*n-1)
end
first.each {|it| 
	print it, "  ",search(it,second),"  ",search(it,third),"\n"
	if(it == 40755)
		next
	end
	if(search(it,second) & search(it,third))
		break
	end
}



