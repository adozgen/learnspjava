package com.adozgen.learnjava.collection.list.linkedList;


import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private Queue<Task> taskQueue = new LinkedList<>();
    private Deque<Task> taskHistory = new LinkedList<>();

    public void setTasks(Task task) {
        taskQueue.offer(task);
    }
    public Task processTask(){
        Task task = taskQueue.poll();
        if (task != null){
            taskHistory.push(task);
        }
        return task;
    }

    public List<Task> getTaskHistory(){
        return new ArrayList<>(taskHistory);
    }
}
