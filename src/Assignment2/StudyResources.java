package Assignment2;

interface PhysicalLibrary {
    void checkoutBook(String bookTitle);
}

class LibraryBook implements PhysicalLibrary {
    @Override
    public void checkoutBook(String bookTitle) {
        System.out.println("Book checked out from the physical library: " + bookTitle);
    }
}

interface OnlineCoursePlatform {
    void accessCourse(String courseTitle);
}

class OnlineCourse implements OnlineCoursePlatform {
    @Override
    public void accessCourse(String courseTitle) {
        System.out.println("Accessing online course: " + courseTitle);
    }
}

class StudyResourceAdapter implements PhysicalLibrary {
    private OnlineCoursePlatform onlineCoursePlatform;

    public StudyResourceAdapter(OnlineCoursePlatform newPlatform) {
        this.onlineCoursePlatform = newPlatform;
    }

    @Override
    public void checkoutBook(String bookTitle) {
        onlineCoursePlatform.accessCourse(bookTitle);
    }
}

public class StudyResources {
    public static void main(String[] args) {
        PhysicalLibrary libraryBook = new LibraryBook();
        libraryBook.checkoutBook("Design Patterns: Elements of Reusable Object-Oriented Software");

        OnlineCoursePlatform onlineCourse = new OnlineCourse();
        PhysicalLibrary adaptedResource = new StudyResourceAdapter(onlineCourse);
        adaptedResource.checkoutBook("Advanced Java Programming");
    }
}
