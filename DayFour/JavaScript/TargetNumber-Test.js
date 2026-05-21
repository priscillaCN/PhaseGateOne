const {getTarget} = require ('./TargetNumber-function')

test("test-addition-of-two-array-elements-give-expected-result-6", () => {

    const numbers = {8, 6, 12, 4, -2}
    let target = 6

    expect(getTarget(numbers[0], numbers[4])).toBe(6);

})


test("test-addition-of-two-array-elements-give-expected-result-6", () => {

    const numbers = {1, 2, 5, 7, 6, 8, 9}
    let target = 12

    expect(getTarget(numbers[2], numbers[3])).toBe(12);

})
