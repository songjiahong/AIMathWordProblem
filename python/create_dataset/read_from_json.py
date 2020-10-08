import pandas as pd

def data_from_json():
    data_json = pd.read_json('./data/OneVariableSingleEQ.json')
    data = pd.DataFrame({'Question':list(data_json['sQuestion'].values), 'Equation':list(data_json['lEquations'].apply(lambda x: x[0]).values)})
    
    return data.sample(frac=1)