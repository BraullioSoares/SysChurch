import {useEffect, useState} from 'react';
import {supabase} from '../../../lib/api';

function MemberList() {
    useEffect(() => {
        fetchMembers().catch(console.error);
    })

    const [members, setMembers] = useState([])
    const fetchMembers = async () => {
        let {data: members, error} = await supabase
            .from("Members")
            .select('*');
        if (error) console.log("error", error);
        else setMembers(members);
    }

    return(
        <div>
            <ul>
                {members.length ? (
                    members.map((member) => (
                        <li key={member.id}>
                            {member.name}
                        </li>
                    ))
                ) : (
                    <span>
                        No members found!
                    </span>
                )}
            </ul>
        </div>
    )
}

export default MemberList;