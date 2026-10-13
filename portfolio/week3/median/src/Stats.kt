// Task 7.7.1: statistics functions


fun median(ls: List<Float>): Float {
    if (ls.size == 0) {
        throw(IllegalArgumentException("can't have empty list"))
    }
    if (ls.size == 1) {
        return ls[0]
    }
    if (ls.size == 2) {
        return (ls[0] + ls[1])/2
    }
    var newList = ls.sorted()
    var mid: Int = (newList.size / 2)-1
    if (newList.size%2 == 1) {
        return newList[mid+1];
    }
    else {
        return (newList[mid]+newList[mid+1])/2
    }

}