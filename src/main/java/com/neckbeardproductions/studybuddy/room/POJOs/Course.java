package com.neckbeardproductions.studybuddy.room.POJOs;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import com.neckbeardproductions.studybuddy.room.Entities.CourseDetails;
import com.neckbeardproductions.studybuddy.room.Entities.CourseFile;
import com.neckbeardproductions.studybuddy.room.Entities.Deadline;
import com.neckbeardproductions.studybuddy.room.Entities.Lecture;
import com.neckbeardproductions.studybuddy.room.Entities.Lecturer;
import com.neckbeardproductions.studybuddy.room.Entities.Note;
import com.neckbeardproductions.studybuddy.room.Entities.Resource;

import java.util.List;

/**
 * Created by Alistair on 10/11/2017.
 * Used by room persistance library. holder for all details about a course. Used with course DAO
 */

public class Course {

    public Course(){

    }

    public Course(CourseDetails courseDetails, List<Lecturer> lecturers, List<Note> notes, List<CourseFile> files, List<Lecture> lectures, List<Deadline> deadlines, List<Resource> resources){
        this.courseDetails = courseDetails;
        this.lecturers = lecturers;
        this.notes = notes;
        this.files = files;
        this.lectures = lectures;
        this.deadlines = deadlines;
        this.resources = resources;
    }

    @Embedded
    private CourseDetails courseDetails;

    @Relation(parentColumn = "id", entityColumn = "courseId", entity = Lecturer.class)
    private List<Lecturer> lecturers;

    @Relation(parentColumn = "id", entityColumn = "courseId", entity = Note.class)
    private List<Note> notes;

    @Relation(parentColumn = "id", entityColumn = "courseId", entity = CourseFile.class)
    private List<CourseFile> files;

    @Relation(parentColumn = "id", entityColumn = "courseId", entity = Lecture.class)
    private List<Lecture> lectures;

    @Relation(parentColumn = "id", entityColumn = "courseId", entity = Deadline.class)
    private List<Deadline> deadlines;

    @Relation(parentColumn = "id", entityColumn = "courseId", entity = Resource.class)
    private List<Resource> resources;

    public CourseDetails getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(CourseDetails courseDetails) {
        this.courseDetails = courseDetails;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<CourseFile> getFiles() {
        return files;
    }

    public void setFiles(List<CourseFile> files) {
        this.files = files;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public List<Deadline> getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(List<Deadline> deadlines) {
        this.deadlines = deadlines;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

}

