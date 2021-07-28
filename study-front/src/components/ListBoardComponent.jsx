import React, { Component } from 'react';
import BoardService from '../service/BoardService';

class ListBoardComponent extends Component {
    constructor(props) {
        super(props)
        // # 1.
        this.state = {
            board: []
        }

    }
    // # 2.
    componentDidMount() {
        BoardService.getBoards().then((res) => {
            this.setState({ board: res.data});
        });
    }

    // # 3.
    render() {
        return (
            <div>
                <h2 className="text-center">Boards List</h2>
                <div className ="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>글 번호</th>
                            <th>타이틀 </th>
                            <th>조회수 </th>
                            <th>작성일 </th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.board.map(
                                board =>
                                    <tr key = {board.seq}>
                                        <td> {board.seq} </td>
                                        <td> {board.title} </td>
                                        <td> {board.view} </td>
                                        <td> {board.regdate} </td>
                                    </tr>
                            )
                        }
                        </tbody>
                    </table>
                </div></div>
                );
                }
                }
                export default ListBoardComponent;