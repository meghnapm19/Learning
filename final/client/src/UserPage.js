import React,{ useState} from "react";

export default function Form() {

  const [name, setName] = useState({
      firstname : ""
     });

  const[details,setDetails]=useState([]);
  const[error,setError]=useState(null);

    //handleName function
    const handleName = (e) => {
        const name = e.target.name;
        const value = e.target.value;

        console.log(name,value);

        //this will fetch the value field input
        setName( {...setName,[name]:value})
    }

    //handleSubmit function
    const handleSubmit = (e) => {
        e.preventDefault();

        const newDetail ={ ...name, id : new Date().getTime()}
        setName({firstname:""})

    console.log(newDetail.firstname)
    fetch("/"+newDetail.firstname).then(

    response =>
    {
        if(response.ok){
           return response.json()
        }
        throw response
    })
    .then((data) => {setPlaceholder(data?.list[0]["lastName"]);
    })
    .catch(error => {
    setPlaceholder("No Records Found!!")
    })
     };

const [placeholder, setPlaceholder] = useState('');

// Declaring the form
 return (
<div className="form">
      <div>
        <h1>User Details</h1>
      </div>
        <form action="" onSubmit={handleSubmit}>
        <div>
        <label htmlFor="firstname" >Enter First Name : </label>
        <input onChange={handleName} autoComplete="off" name="firstname" id="firstname" value={name.firstname} type="text" />

        <br/>
        <br/>

        <button  type="submit"> Enter </button>
        </div>
        </form>
        <div>
        <p> Last Name is {placeholder} </p>
        </div>
  </div>
 )
}


