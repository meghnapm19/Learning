from venv import create
from flask import Flask, jsonify
import os


app = Flask(__name__, static_folder='./build', static_url_path='/')

# Initializing the List to store the names in the form of dictionary
lists = [
    {
        'firstName': 'Meghna',
        'lastName': 'Pudupakkam Mukesh',
    }
]

#Declaring all the routes below

@app.route('/')
def index():
    return app.send_static_file('index.html')


@app.errorhandler(404)
def not_found(e):
    return app.send_static_file('index.html')

#To Check if the first name is given in the list
@app.route("/<string:list_id>", methods=['GET', 'POST'])
def get_list(list_id):
    _list = [_list for _list in lists if _list['firstName'] == list_id]
    return jsonify({'list': _list})


# Run the app
if __name__ == "__main__":
    app.run(host='0.0.0.0', debug=False, port=os.environ.get('PORT', 80))