//str 에 나타나는 숫자중 최소값과 최대값의 형태의 문자열을 반환하시오

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var list = s.split(" ")
        var intList = mutableListOf<Int>()
        list.forEach{
            intList.add(it.toInt())
        }
        intList.sort()
        answer = "${intList.first()} ${intList.last()}"
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution("1 2 3 4")//"1 4"
    a.solution("-1 -2 -3 -4")//"-4 -1"
    a.solution("-1 -1")//"-1 -1"
}