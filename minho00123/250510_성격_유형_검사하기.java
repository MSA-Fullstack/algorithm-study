import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[][] type = new int[4][2];
        char[][] characters = { {'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'} };
        int length = survey.length;
        
        for (int i = 0; i < length; i++) {
            String element = survey[i];
            int choice = choices[i];
            
            switch (element) {
                    case "RT" -> {
                        switch (choice) {
                                case 1 -> type[0][0] += 3;
                                case 2 -> type[0][0] += 2;
                                case 3 -> type[0][0] += 1;
                                case 5 -> type[0][1] += 1;
                                case 6 -> type[0][1] += 2;
                                case 7 -> type[0][1] += 3;
                        }
                    }
                    case "TR" -> {
                        switch (choice) {
                                case 1 -> type[0][1] += 3;
                                case 2 -> type[0][1] += 2;
                                case 3 -> type[0][1] += 1;
                                case 5 -> type[0][0] += 1;
                                case 6 -> type[0][0] += 2;
                                case 7 -> type[0][0] += 3;
                        }
                    }
                    case "CF" -> {
                        switch (choice) {
                                case 1 -> type[1][0] += 3;
                                case 2 -> type[1][0] += 2;
                                case 3 -> type[1][0] += 1;
                                case 5 -> type[1][1] += 1;
                                case 6 -> type[1][1] += 2;
                                case 7 -> type[1][1] += 3;
                        }
                    }
                    case "FC" -> {
                        switch (choice) {
                                case 1 -> type[1][1] += 3;
                                case 2 -> type[1][1] += 2;
                                case 3 -> type[1][1] += 1;
                                case 5 -> type[1][0] += 1;
                                case 6 -> type[1][0] += 2;
                                case 7 -> type[1][0] += 3;
                        }
                    }
                    case "JM" -> {
                        switch (choice) {
                                case 1 -> type[2][0] += 3;
                                case 2 -> type[2][0] += 2;
                                case 3 -> type[2][0] += 1;
                                case 5 -> type[2][1] += 1;
                                case 6 -> type[2][1] += 2;
                                case 7 -> type[2][1] += 3;
                        }
                    }
                    case "MJ" -> {
                        switch (choice) {
                                case 1 -> type[2][1] += 3;
                                case 2 -> type[2][1] += 2;
                                case 3 -> type[2][1] += 1;
                                case 5 -> type[2][0] += 1;
                                case 6 -> type[2][0] += 2;
                                case 7 -> type[2][0] += 3;
                        }
                    }
                    case "AN" -> {
                        switch (choice) {
                                case 1 -> type[3][0] += 3;
                                case 2 -> type[3][0] += 2;
                                case 3 -> type[3][0] += 1;
                                case 5 -> type[3][1] += 1;
                                case 6 -> type[3][1] += 2;
                                case 7 -> type[3][1] += 3;
                        }
                    }
                    case "NA" -> {
                        switch (choice) {
                                case 1 -> type[3][1] += 3;
                                case 2 -> type[3][1] += 2;
                                case 3 -> type[3][1] += 1;
                                case 5 -> type[3][0] += 1;
                                case 6 -> type[3][0] += 2;
                                case 7 -> type[3][0] += 3;
                        }
                    }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            int maxIdx = Arrays.binarySearch(type[i], Math.max(type[i][0], type[i][1]));
            answer += characters[i][maxIdx];
        }

        return answer;
    }
}

