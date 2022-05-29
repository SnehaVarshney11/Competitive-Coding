package May;

class FormCoilsInMatrix {
    static int[][] formCoils(int n) {
        // code here
        int[][] output = new int[2][8 * n * n];
        int[] start = {2*n, 2*n-1};

        int down = start[0];
        int left = start[1];
        
        int top = start[0] - 2;
        int right = start[1] + 2;
        
        int ptr = 0;
        while (top >= 0 && down < 4*n && left >= 0 && right < 4*n) {
            try {
                for (int i = down ; i > top ; i--) {
                    output[0][ptr++] = 4*n*i + left + 1;
                }
                down += 2;
                
                for (int i = left ; i < right ; i++) {
                    output[0][ptr++] = 4*n*top + i + 1;
                }
                left -= 2;
                
                for (int i = top ; i < down ; i++) {
                    output[0][ptr++] = 4*n*i + right + 1;
                }
                top -= 2;
                
                for (int i = right ; i > left ; i--) {
                    output[0][ptr++] = 4*n*down + i + 1;
                }
                right += 2;
            } catch (Exception e) {
                break;
            }
        }
        
        start = new int[]{2*n-1, 2*n};
        down = start[0] + 2;
        left = start[1] - 2;
        
        top = start[0];
        right = start[1];
        
        ptr = 0;
        while (top >= 0 && down < 4*n && left >= 0 && right < 4*n) {
            try {
                for (int i = top ; i < down ; i++) {
                    output[1][ptr++] = 4*n*i + right + 1;
                }
                top -= 2;
                
                for (int i = right ; i > left ; i--) {
                    output[1][ptr++] = 4*n*down + i + 1;
                }
                right += 2;
                
                for (int i = down ; i > top ; i--) {
                    output[1][ptr++] = 4*n*i + left + 1;
                }
                down += 2;
                
                for (int i = left ; i < right ; i++) {
                    output[1][ptr++] = 4*n*top + i + 1;
                }
                left -= 2;
            } catch (Exception e) {
                break;
            }
        }
        
        return output;
    }
}
