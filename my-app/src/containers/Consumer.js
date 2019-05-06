import React, { Component } from 'react'
import axios from '../axios'
import classes from './Consumer.css'

class Consumer extends Component {

    state = {
        lugares: [],
        places: false
    }

    componentDidMount() {
        axios.get('/travel')
        .then(response => {
            this.setState({lugares: response.data});
        })
    }

    getAll = () => {
        this.setState({places: true})
    }

    getAllOff = () => {
        this.setState({places: false})
    }

    render() { 
        let attachedClasses = [classes.Consumer, classes.Close];
        if (this.state.places) {
            attachedClasses = [classes.Consumer, classes.Open];
        }
        return (
            <div className={classes.Pai}>
                <div className={classes.Div}></div>
                {this.state.places ? 
                (<div className={classes.Consumer}>
                    <div className={attachedClasses.join(' ')} onClick={this.getAllOff}>
                        <div >
                            {this.state.lugares.map((item) =>
                                <p key={item.id}>
                                    {item.travel}
                                </p>
                            )}
                        </div>
                    </div> 
                </div>)
                : 
                <div className={classes.Consumer}>
                    <div className={attachedClasses.join(' ')} onClick={this.getAll}>
                        <p>Lugares</p>
                    </div>
                </div>}
                <div className={classes.Div}></div>
            </div>
        )
    }
}

export default Consumer;