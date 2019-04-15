package varable



def sum = 0
/**
 * 对范围进行循环
 */
for (i in 0..9) {
    sum += i
}
println(sum)

/**
 * 对List的循环
 */
for (i in [1, 2, 3, 4, 5, 6, 7, 8, 9]) {
    sum += i
}

/**
 * 对Map进行循环
 */
for (i in ['lili': 1, 'luck': 2, 'xiaoming': 3]) {
    sum += i.value
}
