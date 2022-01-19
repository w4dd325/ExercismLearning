from datetime import timedelta
def add(moment):
    return moment + timedelta(seconds=10**9)

#https://docs.python.org/3/library/datetime.html
#class datetime.timedelta
#A duration expressing the difference between two date, time, or datetime instances to microsecond resolution.