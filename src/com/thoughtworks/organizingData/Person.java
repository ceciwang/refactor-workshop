package com.thoughtworks.organizingData;

import com.thoughtworks.organizingData.Course;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private Set courses = new HashSet();

    public void addCourse(Course arg){
        courses.add(arg);
    }

    public void removeCourse(Course arg){
        courses.remove(arg);
    }
    public Set getCourses() {
        return courses;
    }

    public void initializeCourses(Set courses) {
        courses.addAll(courses);
    }
}

