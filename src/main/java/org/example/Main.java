package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks=new HashSet<>();
        Task taskAnn=new Task("wit","dummy desc","bob",Status.IN_QUEUE,Priority.MED);
        Task taskAnn2=new Task("wit","dummy desc2","bob",Status.IN_QUEUE,Priority.MED);
        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);
        Set<Task> bobsTasks=new HashSet<>();
        Task bobTask=new Task("wit","dummy desc","ann",Status.IN_QUEUE,Priority.MED);
        Task bobTask2=new Task("wit","dummy desc2","ann",Status.IN_QUEUE,Priority.MED);
        bobsTasks.add(bobTask);
        bobsTasks.add(bobTask2);
        Set<Task> carolsTasks=new HashSet<>();
        Task carolTask=new Task("wit","dummy desc","ann",Status.IN_QUEUE,Priority.MED);
        Task carolTask2=new Task("wit","dummy desc2","ann",Status.IN_QUEUE,Priority.MED);
        carolsTasks.add(carolTask);
        carolsTasks.add(carolTask2);
        Set<Task> unassignedTasks=new HashSet<>();
        Task unassigned=new Task("wit","dummy desc","ann",Status.IN_QUEUE,Priority.MED);
        Task unassigned2=new Task("wit","dummy desc2","ann",Status.IN_QUEUE,Priority.MED);
        unassignedTasks.add(unassigned);
        unassignedTasks.add(unassigned2);
        TaskData taskData=new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);
        System.out.println("bobs: "+taskData.getTasks("bob"));
        System.out.println("ann: "+taskData.getTasks("ann"));
        System.out.println("carol: "+taskData.getTasks("carol"));


    }
}