Dim x As Integer = 12
Dim y As Integer = 9
Dim z As Integer = 15
Dim firstResult, secondResult, thirdResult As Boolean
firstResult = (x > y) Xor (y < z)
secondResult = (y < x) Xor (y > z)
thirdResult = (y > x) Xor (z < y)
MessageBox.Show ("first result = " & firstResult)
MessageBox.Show ("second result = " & secondResult)
MessageBox.Show ("third result = " & thirdResult)