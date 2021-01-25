function isPrime(num) {
	for(var i=2;i<=Math.sqrt(num);i++) {
		if(num%2==0){
			return false;
		}
	}
	return true;
}