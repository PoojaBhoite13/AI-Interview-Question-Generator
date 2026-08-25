import React from 'react'
import { useState } from 'react'
import axios from 'axios';

export default function InterviewQuestionGenerator() {
    let [technology,settechnology]=useState("");
    let [experiencelevel,setexperiencelevel]=useState("");
    let [questioncount,setquestioncount]=useState(0);
    let [questions,setquestions]=useState("");

    let generatequestions=(event)=>
    {
        event.preventDefault();
        let input={technology,experiencelevel,questioncount}
        axios.post("http://localhost:8080/addinterquehistory",input)
        .then((response)=>
        {
            setquestions(response.data);

        })
        .catch((error)=>
        { 
            alert("Error in post operation")

        })

    }
  return (
    <div className='container  mt-5'>
        <div className='card'>
        <div className='card-shadow p-3'>
            
            <h1 className='text-center mb-4'>AI Interview Question Generator</h1>
        <form onSubmit={generatequestions}>
            Select Technology:
            <select className='form-select' onChange={(event)=>{settechnology(event.target.value)}}>
                <option>Select Technology</option>
                <option value="Java">Java</option>
                <option value="Javascript">Javascript</option>
                <option value="HTML">HTML</option>
                <option value="CSS">CSS</option>
                <option value="AngukarJS">AngularJS</option>
                <option value="SpringBoot">SpringBoot</option>
                <option value="SQl">SQL</option>
                <option value="Python">Python</option>
                <option value="Microservices">Microservices</option>
                <option value="ReactJS">ReactJS</option>

            </select>
            Select Experience Level:
            <select className='form-select' onChange={(event)=>{setexperiencelevel(event.target.value)}}>
                <option>Select Experience Level</option>
                <option value="Fresher">Fresher</option>
                <option value="1-2 years">1-2 years</option>
                <option value="3-5 years">3-5 years</option>
                <option value="5-8 years">5-8 years</option>
                <option value="8+ years">8+ years</option>
             </select>

             Select No of Questions to generate :
             <select className='form-control' onChange={(event)=>{setquestioncount(event.target.value)}}>
                <option>Select No of Questions to generate </option>
                <option value="5">5</option>
                <option value="10">10</option>
                <option value="15">15</option>
                <option value="20"> 20</option>
                <option value="25">25</option>
                <option value="30">30</option>
                <option value="35">35</option>


             </select>
             <button className='btn btn-danger'>Generate Questions</button>
        </form>
     
        </div>
           </div>
           {
            questioncount && questions.split("\n").map((q, index)=>
            <div key ={index}style={{"margin":"10px 10px","backgroundColor":"red","color":"white","border":"2px soild black ","borderRadius":"20px","padding":"10px"}}>
                {q}
                </div>)
           }
    </div>
  )
}
