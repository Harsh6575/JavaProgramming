"""
LC2881. Create a New Column
"""
import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['bonus'] = employees['salary'] * 2
    return employees

def main():
    employees = pd.DataFrame({
        'name': ['Alice', 'Bob', 'Charlie'],
        'salary': [50000, 60000, 70000]
    })
    result = createBonusColumn(employees)
    print(result)

if __name__ == "__main__":
    main()