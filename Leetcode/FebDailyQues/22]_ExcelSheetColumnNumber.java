package FebDailyQues;

class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        var columnNumber = 0;
	for (var i = 0; i < columnTitle.length(); i++)
		columnNumber = columnNumber * 26 + columnTitle.charAt(i) - 'A' + 1;
	return columnNumber;
    }
}
