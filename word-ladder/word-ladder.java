class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord == null || beginWord.length() == 0 || endWord == null || endWord.length() == 0 || !wordList.contains(endWord))
            return 0;
        Queue<String> q = new LinkedList<>();
        Set<String> list = new HashSet<>(wordList);
        q.add(beginWord);
        int count = 0;
        int size = 0;
        // q.remove(beginWord);
        while(!q.isEmpty()){
            count++;
            size = q.size();
            for(int j = 0; j < size; j++){
                String currWord = q.poll();
                if(currWord.equals(endWord)){
                    return count;
                }
                int len = currWord.length();
                for(int i = 0; i < len; i++){
                    String pre = currWord.substring(0, i);
                    String post = currWord.substring(i + 1, len);
                    for(char ch ='a'; ch <= 'z'; ch++){
                        String newWord = pre + ch + post;
                        if(list.contains(newWord)){
                            list.remove(newWord);
                            q.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}