// val : 변경불가능한 값 == 상수(value)
// var : 변경가능한 값 == 변수(variable)

val result: Int = 3
print(result) // 3
// result = 4 // 컴파일 에러! val 변수는 대입 연산이 불가능하다!

var mutableResult: Int = 3

print(mutableResult) // 3
mutableResult = 4 // var 변수는 대입 연산이 가능하다!
print(mutableResult) // 4

// var someVariable: Int // 컴파일 에러! 초기화를 해주지 않으면 에러다.
