            Set<Integer> nextNumbers = new HashSet<>();

            for (int x : board) {
                for (int i = 1; i <= n; i++) {
                    if (x % i == 1 && !board.contains(i)) {
                        nextNumbers.add(i);
                        changed = true;
                    }
                }
            }
