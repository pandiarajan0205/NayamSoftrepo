var url = "http://localhost:8080/transaction";

async function getapi(url) {
    
    const response = await fetch(url);
    
    var data = await response.json();

    show(data);
}
getapi(url);
function show(data) {
    let tab = 
        `<tr>
          <th>Id</th>    
          <th>AccountName</th>
          <th>AccountNumber</th>
          <th>Amount</th>
          <th>BankId</th>
          <th>BankName</th>
          <th>TransactionId</th>
          <th>ReceiverAccountName</th>
          <th>ReceiverAccountNumber</th>
          <th>Status</th>
          <th>Date</th>
        </tr>`; 
    for (let r of data) {
        tab += `<tr> 
            <td>${r.id}</td>
            <td>${r.accountname} </td>
            <td>${r.accountnumber} </td>
            <td>${r.amount} </td>
            <td>${r.bankid} </td>
            <td>${r.bankname} </td>
            <td>${r.transactionid} </td>
            <td>${r.receiveraccountname} </td>
            <td>${r.receiveraccountnumber} </td>
            <td>${r.status}</td> 
            <td>${r.date}</td>          
        </tr>`;
    }
    document.getElementById("transaction").innerHTML = tab;
}