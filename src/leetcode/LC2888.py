"""
LC2888. Reshape Data: Concatenate
"""
import pandas as pd

def concatenateData(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1, df2], ignore_index=True)

def main():
    df1 = pd.DataFrame({
        'student_id': [1, 2,3,4],
        'name': ['Mason', 'Ava', 'Charlie', 'Georgia'],
        'age': [8, 6, 15, 17]
    })
    df2 = pd.DataFrame({
        'student_id': [5, 6],
        'name': ['Leo', 'Alex'],
        'age': [7, 7]
    })
    result = concatenateData(df1, df2)
    print(result)

if __name__ == "__main__":
    main()