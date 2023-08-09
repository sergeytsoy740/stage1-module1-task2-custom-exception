package com.epam.mjc;

/*   Task 1:
 * Need create your custom exception which is inherited IllegalArgumentException.

 *   Task 2:
 * Your custom exception should be return custom message like "Could not find student with ID {id}".

 *   Task 3:
 * Implement method 'find' in class StudentManager which are throw your custom exception
 * if this student is not found.
 */

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws IdNotExistsException {
        Student s = Student.getValueOf(studentID);
        try {
            if (s != null) {
                return s;
            } else {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {
            throw new IdNotExistsException("Could not find student with ID " + studentID);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        }

    }
}