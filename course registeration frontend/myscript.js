function showCourses() {
    fetch("http://localhost:8080/courses")
        .then(response => response.json())
        .then(courses => {
            console.log("Courses received:", courses);

            const dataTable = document.getElementById("coursetable");

            if (!dataTable) {
                console.error("coursetable element not found!");
                return;
            }

            dataTable.innerHTML = "";

            courses.forEach(course => {
                const row = `
                    <tr>
                        <td>${course.courseId}</td>
                        <td>${course.courseName}</td>
                        <td>${course.trainer}</td>
                        <td>${course.durationInWeeks}</td>
                    </tr>`;

                dataTable.innerHTML += row;
            });
        })
        .catch(error => console.error("Error:", error));
}


function showEnrolledStudents() {
    fetch("http://localhost:8080/course/enrolled")
        .then(response => {
            if (!response.ok) {
                throw new Error("HTTP error: " + response.status);
            }
            return response.json();
        })
        .then(students => {
            console.log("Enrolled students:", students);

            const dataTable = document.getElementById("enrolledtable");

            if (!dataTable) {
                console.error("Enrolled students table not found!");
                return;
            }

            dataTable.innerHTML = "";

            if (students.length === 0) {
                dataTable.innerHTML = `
                    <tr>
                        <td colspan="3">No enrolled students found.</td>
                    </tr>`;
                return;
            }

            students.forEach(student => {
                const row = `
                    <tr>
                        <td>${student.name}</td>
                        <td>${student.email}</td>
                        <td>${student.courseName}</td>
                    </tr>`;

                dataTable.innerHTML += row;
            });
        })
        .catch(error => {
            console.error("Error fetching enrolled students:", error);
        });
}
