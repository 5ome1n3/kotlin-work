// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string


fun redact(str: String, rmv: String, sym: Char = 'X'): String {
    var startingIndexes = mutableListOf<Int>()
    for (c in 1..str.length-rmv.length) {
        var index: Int = 0;
        var match = false;
        while (index < str.length-rmv.length) {
            if (str[index] == rmv[index]) {
                index++;
            }
            else {
                match = true
                break
            }
        }
        if (match) {
            startingIndexes.add(c)
        }
    }
    return str;
}

