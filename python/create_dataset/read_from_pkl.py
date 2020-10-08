import pickle

def data_from_pkl():
    with open('./data/data_final.pkl', 'rb') as f:
        df = pickle.load(f)
        return df