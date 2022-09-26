package com.archql.labs.tasks;

import java.util.Scanner;

public interface ITask {
    boolean execute();
    String description();
    String detailedDescription();
    String lastInfo();
}
