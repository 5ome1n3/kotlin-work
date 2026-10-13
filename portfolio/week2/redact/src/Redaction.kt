// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string


fun redact(str: String, rmv: String, sym: Char = 'X'): String {
    var startingIndexes = mutableListOf<Int>() // starting indexes of substrs to be changed
    for (c in 0..str.length-rmv.length) {
        var match = true;
        for (n in 0..rmv.length-1) {
            if (str[c+n] != rmv[n]) {
                match = false // isnt a match if characters starting at index c matches rmv (substr to be
                              // removed.
            }
        }
        if (match) {
            startingIndexes.add(c)
        }
    }
    // changes substrs by iterating through the length of the substr to be changed  from the index where
    // it occures
    val newStr: StringBuilder = StringBuilder(str)
    for (i in startingIndexes) {
        for (n in i..i+rmv.length-1) {
            newStr[n] = sym
        }
    }
    return newStr.toString()
}

