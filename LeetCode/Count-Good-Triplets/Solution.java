                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
