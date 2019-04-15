package varable


def x = 1.23
def result
switch (x) {
    case 'foo':
        result = 'found foo'
        break
    case 'bar':
        result = 'fond bar'
        break
    case [4, 5, 6, 'list']:
        result = 'list'
        break
    case 12..30:
        result = 'range'
        break
    case BigDecimal:
        result = 'bigDecimal'
        break
    default:
        result = 'none'
        break
}
println(result)
