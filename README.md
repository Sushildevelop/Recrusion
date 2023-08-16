# Recrusion
Recursion is a fundamental programming concept in which a function calls itself in order to solve a problem. 
It's a powerful technique that allows you to break down complex problems into simpler, self-contained instances of the same problem. 
Recursion is commonly used in various algorithms and data structures.

Key components of recursion:

Base Case: This is the simplest scenario where the function does not make a recursive call. 
           It's the termination condition that prevents infinite recursion. Without a proper base case, the recursion would continue indefinitely.

Recursive Case: In this part of the function, you define how the problem is reduced towards the base case. 
               You break down the problem into smaller sub-problems, often of the same form as the original problem.
               
 
    
       
         recursive_function(parameters)
 {
    if base_case_condition
    {
        # Base case: stop recursion and return a value
        return base_case_value
        }
    else{      
    # Recursive case: break down the problem and call the function recursively
    
        
        result = recursive_function(smaller_problem)
        
        # Manipulate the result if needed
        
        return result
        }
        }
