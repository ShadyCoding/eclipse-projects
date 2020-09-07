movies = []
def menu():
    user_input = input("Enter 'a' to add movies, 'f' to find movies, 'l' to see your movies, and 'q' to quite the program: ")

    while(user_input != 'q'):
        if user_input == 'a':
            add_movie()
        elif user_input == 'l':
            see_movies()
        elif user_input == 'f':
            find_movies()
        else:
            print("unknown command, try again!")
        user_input = input("Enter 'a' to add movies, 'f' to find movies, 'l' to see your movies, and 'q' to quite the program: ")


def add_movie():
    movie_name = input("Enter movie name? ")
    movie_year = int(input("Enter release year? "))
    movies.append({
        'name': movie_name,
        'year': movie_year
    })



def see_movies():
    for film in movies:
        print(f"Name: {film['name']}")
        print(f"Year: {film['year']}\n")


def find_movies():
    found = []
    find_by = input("find movie my name or year: ")
    looking_for = input("name and year: ")
    for movie in movies:
        if movie[find_by] == looking_for:
            found.append(movie)
    return found


menu()
