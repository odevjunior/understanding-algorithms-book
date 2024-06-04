
fun binarySearch(list: List<Int>, selectedNumber:Int): Int {
    var min: Int = 0;
    var max: Int = list.size;
    var x: Int = 0
    while(min <= max) {
        x = x+1
        print("foram necessarios:$x passos \n")
        var response: Int = (max + min) / 2
        if(response == selectedNumber){
            return response;
        }
        if(response > selectedNumber) {
            max = response            
        } else {
            min = response
        }
    }
    return 0;
}

fun main() {
	print(binarySearch(listOf(1,2,3,4,5,6,7,8), 7))
}
