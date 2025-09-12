# year=int(input("enter the year: "))
# if year%4==0 and year%100 !=0 or year%400==0:
#   print(f"{year} is a leap year")
# else:
#   print("not a leap year")

'''FINDING LCM'''

# n=int(input("enter the number 1: "))
# n2=int(input("enter the number 2: "))

# m=max(n,n2)
# while (m%n!=0 or m%n2!=0):  #it will run until both contetion are false,
#   #mean 1st it will check that is m is completly devisible by n or not 
#   #if yes m+=1 if not 
#   m+=1
# print(f"{m} is the LCM")

'''PRIME NUMBER'''
num=int(input("enter the number 1:"))

for i in range(2,num):
  if num%i==0:
    print(f"{num} is not a prime number")
    break
  else:
    print(f"{num} is a prime number")