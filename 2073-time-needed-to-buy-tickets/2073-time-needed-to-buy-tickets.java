class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int[] ticketsCopy = Arrays.copyOf(tickets, tickets.length);
        Deque<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < ticketsCopy.length; i++) {
            queue.add(i);
        }

        int timeResult = 0;
        while (tickets[k] != 0) {
            timeResult++;

            int first = queue.pop();
            tickets[first]--;

            if (tickets[first] != 0) {
                queue.addLast(first);
            }
        }

        return timeResult;
    }
}