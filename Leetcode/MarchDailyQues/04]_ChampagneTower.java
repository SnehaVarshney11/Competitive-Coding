package MarchDailyQues;

import java.util.ArrayList;
import java.util.List;

class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if (poured == 0)
		return 0;
	var prevRow = new ArrayList<>(List.of((double) poured));

	while (query_row-- > 0) {
		var currentRow = new ArrayList<Double>();
		var champagneInEnds = Math.max(0, (prevRow.get(0) - 1) / 2);  // min champagne can be 0
		currentRow.add(champagneInEnds); // first glass

		for (var i = 1; i < prevRow.size(); i++)
			currentRow.add(Math.max(0, (prevRow.get(i - 1) - 1) / 2) + // flow from top-left glass
						   Math.max(0, (prevRow.get(i) - 1) / 2));     // flow from top-right glass

		currentRow.add(champagneInEnds); // last glass
		prevRow = currentRow;
	}
	return Math.min(1, prevRow.get(query_glass));
    }
}
