// Task 7.7.1: statistics functions


fun median(ls: List<Float>): Float {
    var newList = ls.sorted()
    var mid: Int = ls.size / 2
    if (ls.size%2 == 0) {
        return ls[mid-1];
    }
    else {
        return (ls[mid]+ls[mid]+1)/2
    }

}