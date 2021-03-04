
schedule(monday, mediefag).
schedule(tuesdag, matematik).
schedule(wednesday, database).
schedule(thursday, engelsk).
schedule(friday, algoritmer).

difficulty(mediefag, easy).
difficulty(matematik, hard).
difficulty(algoritmer, hard).
difficulty(engelsk, medium).
difficulty(databse, hard).

student(frederikke, mediefag).
student(thomas, algoritmer).
student(claus, matematik).
student(johanne, engelsk).
student(simon, database).

classinformation(Day, Class, Diff):-
    schedule(Day, Class),
    difficulty(Class, Diff).

studentinformation(Student, Class):-
    student(Student, Class).

